package org.intermine.model.bio;

public interface AliasName extends org.intermine.model.InterMineObject
{
    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

    public java.util.Set<org.intermine.model.bio.SequenceFeature> getFeatures();
    public void setFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> features);
    public void addFeatures(final org.intermine.model.bio.SequenceFeature arg);

}
