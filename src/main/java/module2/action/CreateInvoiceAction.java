package module2.action;

import module2.service.ShopService;
import module2.util.UserInput;

import java.util.Optional;

public class CreateInvoiceAction implements Action{

    private static final int DEFAULT_COUNT = 15;

    @Override
    public void execute() {
        if(SHOP_SERVICE.getAllproducts().size() == 0){
            System.out.println("There isn't a single item!\nCreate item!");
            return;
        }
        String[] menu = {"Input your value", "Default value"};
        final int userChoice = UserInput.menu(menu);

        int count;
        if (userChoice == 0) {
            count = Optional.of(UserInput.getInt("Write amount"))
                    .filter(c -> c >= 1)
                    .orElse(DEFAULT_COUNT);
        } else {
            count = DEFAULT_COUNT;
        }

        SHOP_SERVICE.createRandomInvoices(count);
    }
}
