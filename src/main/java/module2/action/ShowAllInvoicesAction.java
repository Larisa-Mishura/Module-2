package module2.action;

public class ShowAllInvoicesAction implements Action{
    @Override
    public void execute() {
        if(INVOICE_REPOSITORY.getAllInvoices().size() == 0){
            System.out.println("There isn't a single invoice!\nCreate invoice!");
            return;
        }
        SHOP_SERVICE.printAllinvoices();
    }
}