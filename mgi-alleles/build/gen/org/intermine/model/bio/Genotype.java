package org.intermine.model.bio;

public interface Genotype extends org.intermine.model.InterMineObject
{
    public java.lang.String getGeneticBackground();
    public void setGeneticBackground(final java.lang.String geneticBackground);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getZygosity();
    public void setZygosity(final java.lang.String zygosity);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Allele> getAlleles();
    public void setAlleles(final java.util.Set<org.intermine.model.bio.Allele> alleles);
    public void addAlleles(final org.intermine.model.bio.Allele arg);

    public java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> getPhenotypeTerms();
    public void setPhenotypeTerms(final java.util.Set<org.intermine.model.bio.MammalianPhenotypeTerm> phenotypeTerms);
    public void addPhenotypeTerms(final org.intermine.model.bio.MammalianPhenotypeTerm arg);

}
