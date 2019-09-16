package org.intermine.model.bio;

public interface Transcript extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getBiotype();
    public void setBiotype(final java.lang.String biotype);

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

}
