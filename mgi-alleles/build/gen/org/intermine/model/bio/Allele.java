package org.intermine.model.bio;

public interface Allele extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> getHighLevelPhenotypeTerms();
    public void setHighLevelPhenotypeTerms(final java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> highLevelPhenotypeTerms);
    public void addHighLevelPhenotypeTerms(final org.intermine.model.bio.MammalianPhenotypeTerm arg);

    public java.util.Set<org.intermine.model.bio.Genotype> getGenotypes();
    public void setGenotypes(final java.util.Set<org.intermine.model.bio.Genotype> genotypes);
    public void addGenotypes(final org.intermine.model.bio.Genotype arg);

}
