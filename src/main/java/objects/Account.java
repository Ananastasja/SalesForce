package objects;

public class Account {
    String accountName;
    String website;
    String phone;
    String description;
    String billingAddress;
    String type;

    public Account(String accountName, String website, String phone, String description, String billingAddress, String type) {
        this.accountName = accountName;
        this.website = website;
        this.phone = phone;
        this.description = description;
        this.billingAddress = billingAddress;
        this.type = type;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
