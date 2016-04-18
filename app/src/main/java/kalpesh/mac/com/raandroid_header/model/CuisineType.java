package kalpesh.mac.com.raandroid_header.model;

/**
 * Created by kalpesh on 05/09/2015.
 */
import com.google.gson.annotations.Expose;


public class CuisineType {

    @Expose
    private Integer Id;
    @Expose
    private String Name;
    @Expose
    private Object SeoName;

    /**
     *
     * @return
     * The Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The SeoName
     */
    public Object getSeoName() {
        return SeoName;
    }

    /**
     *
     * @param SeoName
     * The SeoName
     */
    public void setSeoName(Object SeoName) {
        this.SeoName = SeoName;
    }

}