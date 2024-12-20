package com.pluralsight.model.order;

import com.pluralsight.data.order.Size;
import com.pluralsight.model.interfaces.IHasSizing;

public abstract class SizeableOrderItem extends OrderItem implements IHasSizing {
    protected Size size;

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
}
