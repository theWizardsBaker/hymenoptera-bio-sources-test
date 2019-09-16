package org.intermine.model.bio;

public interface Allele extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getReference();
    public void setReference(final java.lang.String reference);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getAlternate();
    public void setAlternate(final java.lang.String alternate);

    public java.lang.String getClinicalSignificance();
    public void setClinicalSignificance(final java.lang.String clinicalSignificance);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.Disease> getDiseases();
    public void setDiseases(final java.util.Set<org.intermine.model.bio.Disease> diseases);
    public void addDiseases(final org.intermine.model.bio.Disease arg);

}
