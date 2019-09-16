package org.intermine.model.bio;

public interface SNP extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getTissue();
    public void setTissue(final java.lang.String tissue);

    public java.lang.Double getPValue();
    public void setPValue(final java.lang.Double pValue);

    public java.lang.Integer getTssDistance();
    public void setTssDistance(final java.lang.Integer tssDistance);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
