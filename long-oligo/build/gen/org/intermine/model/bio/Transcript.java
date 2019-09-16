package org.intermine.model.bio;

public interface Transcript extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public java.util.Set<org.intermine.model.bio.MicroarrayOligo> getMicroarrayOligos();
    public void setMicroarrayOligos(final java.util.Set<org.intermine.model.bio.MicroarrayOligo> microarrayOligos);
    public void addMicroarrayOligos(final org.intermine.model.bio.MicroarrayOligo arg);

}
