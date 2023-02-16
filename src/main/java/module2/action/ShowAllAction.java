package module2.action;

public class ShowAllAction implements Action{
    @Override
    public void execute() {
        if(SHOP_SERVICE.getAllproducts().size() == 0){
            System.out.println("There isn't a single item!\nCreate item!");
            return;
        }
        SHOP_SERVICE.printAllProducts();
    }
}
