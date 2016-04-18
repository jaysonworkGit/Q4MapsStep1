package kalpesh.mac.com.raandroid_header.model;

/**
 * Created by kalpesh on 05/09/2015.
 */
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class Restaurant {

    @Expose
    private Integer Id;
    @Expose
    private String Name;
    @Expose
    private String Address;
    @Expose
    private String Postcode;
    @Expose
    private String City;
    @Expose
    private List<CuisineType> CuisineTypes = new ArrayList<CuisineType>();
    @Expose
    private String Url;
    @Expose
    private Boolean IsOpenNow;
    @Expose
    private Boolean IsSponsored;
    @Expose
    private Boolean IsNew;
    @Expose
    private Boolean IsTemporarilyOffline;
    @Expose
    private String ReasonWhyTemporarilyOffline;
    @Expose
    private String UniqueName;
    @Expose
    private Boolean IsCloseBy;
    @Expose
    private Boolean IsHalal;
    @Expose
    private Integer DefaultDisplayRank;
    @Expose
    private Boolean IsOpenNowForDelivery;
    @Expose
    private Boolean IsOpenNowForCollection;
    @Expose
    private Double RatingStars;
    @Expose
    private List<kalpesh.mac.com.raandroid_header.model.Logo> Logo = new ArrayList<kalpesh.mac.com.raandroid_header.model.Logo>();
    @Expose
    private List<Object> Deals = new ArrayList<Object>();
    @Expose
    private Integer NumberOfRatings;

    /**
     * @return The Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id The Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return The Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address The Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return The Postcode
     */
    public String getPostcode() {
        return Postcode;
    }

    /**
     * @param Postcode The Postcode
     */
    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    /**
     * @return The City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City The City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return The CuisineTypes
     */
    public List<CuisineType> getCuisineTypes() {
        return CuisineTypes;
    }

    /**
     * @param CuisineTypes The CuisineTypes
     */
    public void setCuisineTypes(List<CuisineType> CuisineTypes) {
        this.CuisineTypes = CuisineTypes;
    }

    /**
     * @return The Url
     */
    public String getUrl() {
        return Url;
    }

    /**
     * @param Url The Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * @return The IsOpenNow
     */
    public Boolean getIsOpenNow() {
        return IsOpenNow;
    }

    /**
     * @param IsOpenNow The IsOpenNow
     */
    public void setIsOpenNow(Boolean IsOpenNow) {
        this.IsOpenNow = IsOpenNow;
    }

    /**
     * @return The IsSponsored
     */
    public Boolean getIsSponsored() {
        return IsSponsored;
    }

    /**
     * @param IsSponsored The IsSponsored
     */
    public void setIsSponsored(Boolean IsSponsored) {
        this.IsSponsored = IsSponsored;
    }

    /**
     * @return The IsNew
     */
    public Boolean getIsNew() {
        return IsNew;
    }

    /**
     * @param IsNew The IsNew
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * @return The IsTemporarilyOffline
     */
    public Boolean getIsTemporarilyOffline() {
        return IsTemporarilyOffline;
    }

    /**
     * @param IsTemporarilyOffline The IsTemporarilyOffline
     */
    public void setIsTemporarilyOffline(Boolean IsTemporarilyOffline) {
        this.IsTemporarilyOffline = IsTemporarilyOffline;
    }

    /**
     * @return The ReasonWhyTemporarilyOffline
     */
    public String getReasonWhyTemporarilyOffline() {
        return ReasonWhyTemporarilyOffline;
    }

    /**
     * @param ReasonWhyTemporarilyOffline The ReasonWhyTemporarilyOffline
     */
    public void setReasonWhyTemporarilyOffline(String ReasonWhyTemporarilyOffline) {
        this.ReasonWhyTemporarilyOffline = ReasonWhyTemporarilyOffline;
    }

    /**
     * @return The UniqueName
     */
    public String getUniqueName() {
        return UniqueName;
    }

    /**
     * @param UniqueName The UniqueName
     */
    public void setUniqueName(String UniqueName) {
        this.UniqueName = UniqueName;
    }

    /**
     * @return The IsCloseBy
     */
    public Boolean getIsCloseBy() {
        return IsCloseBy;
    }

    /**
     * @param IsCloseBy The IsCloseBy
     */
    public void setIsCloseBy(Boolean IsCloseBy) {
        this.IsCloseBy = IsCloseBy;
    }

    /**
     * @return The IsHalal
     */
    public Boolean getIsHalal() {
        return IsHalal;
    }

    /**
     * @param IsHalal The IsHalal
     */
    public void setIsHalal(Boolean IsHalal) {
        this.IsHalal = IsHalal;
    }

    /**
     * @return The DefaultDisplayRank
     */
    public Integer getDefaultDisplayRank() {
        return DefaultDisplayRank;
    }

    /**
     * @param DefaultDisplayRank The DefaultDisplayRank
     */
    public void setDefaultDisplayRank(Integer DefaultDisplayRank) {
        this.DefaultDisplayRank = DefaultDisplayRank;
    }

    /**
     * @return The IsOpenNowForDelivery
     */
    public Boolean getIsOpenNowForDelivery() {
        return IsOpenNowForDelivery;
    }

    /**
     * @param IsOpenNowForDelivery The IsOpenNowForDelivery
     */
    public void setIsOpenNowForDelivery(Boolean IsOpenNowForDelivery) {
        this.IsOpenNowForDelivery = IsOpenNowForDelivery;
    }

    /**
     * @return The IsOpenNowForCollection
     */
    public Boolean getIsOpenNowForCollection() {
        return IsOpenNowForCollection;
    }

    /**
     * @param IsOpenNowForCollection The IsOpenNowForCollection
     */
    public void setIsOpenNowForCollection(Boolean IsOpenNowForCollection) {
        this.IsOpenNowForCollection = IsOpenNowForCollection;
    }

    /**
     * @return The RatingStars
     */
    public Double getRatingStars() {
        return RatingStars;
    }

    /**
     * @param RatingStars The RatingStars
     */
    public void setRatingStars(Double RatingStars) {
        this.RatingStars = RatingStars;
    }

    /**
     * @return The Logo
     */
    public List<kalpesh.mac.com.raandroid_header.model.Logo> getLogo() {
        return Logo;
    }

    /**
     * @param Logo The Logo
     */
    public void setLogo(List<kalpesh.mac.com.raandroid_header.model.Logo> Logo) {
        this.Logo = Logo;
    }

    /**
     * @return The Deals
     */
    public List<Object> getDeals() {
        return Deals;
    }

    /**
     * @param Deals The Deals
     */
    public void setDeals(List<Object> Deals) {
        this.Deals = Deals;
    }

    /**
     * @return The NumberOfRatings
     */
    public Integer getNumberOfRatings() {
        return NumberOfRatings;
    }

    /**
     * @param NumberOfRatings The NumberOfRatings
     */
    public void setNumberOfRatings(Integer NumberOfRatings) {
        this.NumberOfRatings = NumberOfRatings;
    }
}