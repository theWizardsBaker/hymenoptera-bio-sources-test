package org.intermine.model.bio;

public interface CDS extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getHasEarlyStopCodon();
    public void setHasEarlyStopCodon(final java.lang.String hasEarlyStopCodon);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

}