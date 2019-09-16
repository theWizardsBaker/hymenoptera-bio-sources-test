package org.intermine.model.bio;

public interface GeoMetadata extends org.intermine.model.InterMineObject
{
    public java.lang.String getSeries();
    public void setSeries(final java.lang.String series);

    public java.lang.String getSummary();
    public void setSummary(final java.lang.String summary);

    public java.lang.String getTitle();
    public void setTitle(final java.lang.String title);

    public java.lang.String getPlatformDesign();
    public void setPlatformDesign(final java.lang.String platformDesign);

    public java.lang.String getPlatform();
    public void setPlatform(final java.lang.String platform);

    public java.lang.String getSamples();
    public void setSamples(final java.lang.String samples);

    public java.lang.String getContributor();
    public void setContributor(final java.lang.String contributor);

    public java.lang.String getExperiment();
    public void setExperiment(final java.lang.String experiment);

    public java.lang.String getContact();
    public void setContact(final java.lang.String contact);

    public java.lang.String getDesign();
    public void setDesign(final java.lang.String design);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
