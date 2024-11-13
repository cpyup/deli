package com.pluralsight.model.order;

import com.pluralsight.data.options.Size;
import com.pluralsight.model.interfaces.IHasSizing;

public abstract class SizeableOrderItem extends OrderItem implements IHasSizing {
    protected Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
