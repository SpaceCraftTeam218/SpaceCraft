package com.jacat.WindmillMod.block.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWindmill extends TileEntity implements ISidedInventory{

    private ItemStack[] slots = new ItemStack[2];

    public float rotation = 0;

    public int maxPower = 10000;
    public float power = 0;

    public float powerPerRotation = 0.1F;

    public void updateEntity(){
        if(this.getWorldObj().getBlockMetadata(this.xCoord, this.yCoord, this.zCoord) > 6){
            rotation+=1;



            power+=powerPerRotation;
            if(power > maxPower) power = maxPower;
        }
    }

    public int getPowerScaled(int scaled){
        return  (int) (this.power * scaled / this.maxPower);
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int side) {
        return new int[0];
    }

    public void readFromNBT(NBTTagCompound nbt)
    {

        super.readFromNBT(nbt);

        NBTTagList list = nbt.getTagList("Slots", 10);

        this.slots = new ItemStack[getSizeInventory()];

        for(int i = 0; i < list.tagCount(); i++){
            NBTTagCompound item = list.getCompoundTagAt(i);
            byte b = item.getByte("Item");

            if(b >= 0 && b < this.slots.length){
                this.slots[b] = ItemStack.loadItemStackFromNBT(item);
            }
        }

        this.power = nbt.getInteger("Power");

        if(nbt.hasKey("CustomName")){
            this.setInventoryName(nbt.getString("CustomName"));
        }

    }

    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);

        nbt.setFloat("Power", this.power);

        NBTTagList list = new NBTTagList();

        for(int i = 0; i < this.slots.length; i++){
            if(this.slots[i] != null){
                NBTTagCompound item = new NBTTagCompound();
                item.setByte("Item", (byte) i);
                this.slots[i].writeToNBT(item);
                list.appendTag(item);
            }
        }

        nbt.setTag("Slots", list);

        if(this.hasCustomInventoryName()){
            nbt.setString("CustomName", this.getInventoryName());
        }

    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack itemStack, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack itemStack, int p_102008_3_) {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {

        return this.slots[slot];

    }

    @Override
    public ItemStack decrStackSize(int slot, int count) {
        if(this.slots[slot] != null){
            ItemStack itemStack;

            if(this.slots[slot].stackSize <= count) {
                itemStack = this.slots[slot];
                this.slots[slot] = null;
                return itemStack;
            }
            else {
                itemStack = this.slots[slot].splitStack(count);

                if(this.slots[slot].stackSize == 0) {
                    this.slots[slot] = null;
                }
            }
            return itemStack;
        }

        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if(this.slots[slot] != null){
            ItemStack itemStack = this.slots[slot];
            this.slots[slot] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemStack) {
        this.slots[slot] = itemStack;

        if(itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
            itemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    public void setInventoryName(String name) {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        return false;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
        return false;
    }
}
