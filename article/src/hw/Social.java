package hw;

public class Social {
    public static void main(String[] args) {
        Product[] products = {
                new Product(10000),
                new Product(20000),
                new Product(30000),
                new Product(40000),
                new Product(50000),
        };

        Customer martCustomer = new Customer(50000);
        Mart mart = new Mart(products);
        System.out.println("[마트] 소지금=" + martCustomer.getMoney());
        mart.order(martCustomer, 0, 1);
        System.out.println("[마트] 소지금=" + martCustomer.getMoney());

        Customer cvsCustomer = new Customer(15000, 13000);
        ConvenienceStore cvs = new ConvenienceStore(products);
        System.out.println("[편의점] 소지금=" + cvsCustomer.getMoney()
                + ", point=" + cvsCustomer.getPoint());
        cvs.order(cvsCustomer, 0, 1);
        System.out.println("[편의점] 소지금=" + cvsCustomer.getMoney()
                + ", point=" + cvsCustomer.getPoint());

        DepartmentStore dept = new DepartmentStore(products);
        Guest guest = new Guest(30000, 15000);
        VIP vip = new VIP(30000, 15000);
        VVIP vvip = new VVIP(30000, 15000);

        System.out.println("[백화점: 일반] 소지금=" + guest.getMoney()
                + ", point=" + guest.getPoint());
        dept.order(guest, 1, 1, 5000);
        System.out.println("[백화점: 일반] 소지금=" + guest.getMoney()
                + ", point=" + guest.getPoint());

        System.out.println("[백화점: VIP] 소지금=" + vip.getMoney()
                + ", point=" + vip.getPoint());
        dept.order(vip, 1, 1, 5000);
        System.out.println("[백화점: VIP] 소지금=" + vip.getMoney()
                + ", point=" + vip.getPoint());

        System.out.println("[백화점: VVIP] 소지금=" + vvip.getMoney()
                + ", point=" + vvip.getPoint());
        dept.order(vvip, 1, 1, 5000);
        System.out.println("[백화점: VVIP] 소지금=" + vvip.getMoney()
                + ", point=" + vvip.getPoint());
    }
}
