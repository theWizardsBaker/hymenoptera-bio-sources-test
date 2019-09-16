package org.intermine.model.bio;

public interface DuplicateEntity extends org.intermine.model.InterMineObject
{
    public java.lang.String getProteinIdentifier();
    public void setProteinIdentifier(final java.lang.String proteinIdentifier);

    public java.lang.String getGeneIdentifier();
    public void setGeneIdentifier(final java.lang.String geneIdentifier);

    public java.lang.String getChromosome();
    public void setChromosome(final java.lang.String chromosome);

    public java.lang.Integer getStart();
    public void setStart(final java.lang.Integer start);

    public java.lang.Integer getStrand();
    public void setStrand(final java.lang.Integer strand);

    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public java.lang.String getTranscriptIdentifier();
    public void setTranscriptIdentifier(final java.lang.String transcriptIdentifier);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

}
