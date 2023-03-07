package Exercises4.Ex5;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        try {
            if (qty >= 0) {
                this.qty = qty;
            } else {
                System.out.print("qty khong hop le");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        try {
            if (unitPrice >= 0) {
                this.unitPrice = unitPrice;
            } else {
                System.out.print("unitPrice khong hop le");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ']';
    }
}
