
package bean;


public class coupon {
    private int id;
    private String name;
    private String description;
    private int product_id;
    private String valid_since;
    private String valid_until;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the valid_since
     */
    public String getValid_since() {
        return valid_since;
    }

    /**
     * @param valid_since the valid_since to set
     */
    public void setValid_since(String valid_since) {
        this.valid_since = valid_since;
    }

    /**
     * @return the valid_until
     */
    public String getValid_until() {
        return valid_until;
    }

    /**
     * @param valid_until the valid_until to set
     */
    public void setValid_until(String valid_until) {
        this.valid_until = valid_until;
    }
    
    
}
