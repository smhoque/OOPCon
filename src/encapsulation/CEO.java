package encapsulation;

/**
 * Created by riponctg on 12/7/2016.
 */
public class CEO {
    private int CeoId;
    private String CeoName;
    private String CeoEmail;
    private String CeoPhone;

    public int getCeoId() {
        return CeoId;
    }

    public void setCeoId(int ceoId) {
        CeoId = ceoId;
    }

    public String getCeoName() {
        return CeoName;
    }

    public void setCeoName(String ceoName) {
        CeoName = ceoName;
    }

    public String getCeoEmail() {
        return CeoEmail;
    }

    public void setCeoEmail(String ceoEmail) {
        CeoEmail = ceoEmail;
    }

    public String getCeoPhone() {
        return CeoPhone;
    }

    public void setCeoPhone(String ceoPhone) {
        CeoPhone = ceoPhone;
    }
}
