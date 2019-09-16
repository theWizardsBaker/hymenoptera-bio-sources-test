package org.intermine.model.bio;

public interface Expression extends org.intermine.model.InterMineObject
{
    public java.lang.Float getNormalizedCounts();
    public void setNormalizedCounts(final java.lang.Float normalizedCounts);

    public java.lang.String getSampleName();
    public void setSampleName(final java.lang.String sampleName);

    public java.lang.Integer getRawCounts();
    public void setRawCounts(final java.lang.Integer rawCounts);

    public java.lang.Float getRpkm();
    public void setRpkm(final java.lang.Float rpkm);

    public java.lang.Float getFpkm();
    public void setFpkm(final java.lang.Float fpkm);

    public org.intermine.model.bio.ExpressionMetadata getSampleMetadata();
    public void setSampleMetadata(final org.intermine.model.bio.ExpressionMetadata sampleMetadata);
    public void proxySampleMetadata(final org.intermine.objectstore.proxy.ProxyReference sampleMetadata);
    public org.intermine.model.InterMineObject proxGetSampleMetadata();

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public org.intermine.model.bio.Transcript getIsoform();
    public void setIsoform(final org.intermine.model.bio.Transcript isoform);
    public void proxyIsoform(final org.intermine.objectstore.proxy.ProxyReference isoform);
    public org.intermine.model.InterMineObject proxGetIsoform();

}
