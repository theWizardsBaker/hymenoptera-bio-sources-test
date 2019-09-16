package org.intermine.model.bio;

public interface GWASResult extends org.intermine.model.InterMineObject
{
    public java.lang.String getPhenotype();
    public void setPhenotype(final java.lang.String phenotype);

    public java.lang.String getAssociatedVariantRiskAllele();
    public void setAssociatedVariantRiskAllele(final java.lang.String associatedVariantRiskAllele);

    public java.lang.Double getRiskAlleleFreqInControls();
    public void setRiskAlleleFreqInControls(final java.lang.Double riskAlleleFreqInControls);

    public java.lang.Double getPValue();
    public void setPValue(final java.lang.Double pValue);

    public org.intermine.model.bio.GWAS getStudy();
    public void setStudy(final org.intermine.model.bio.GWAS study);
    public void proxyStudy(final org.intermine.objectstore.proxy.ProxyReference study);
    public org.intermine.model.InterMineObject proxGetStudy();

    public org.intermine.model.bio.SNP getsNP();
    public void setsNP(final org.intermine.model.bio.SNP SNP);
    public void proxysNP(final org.intermine.objectstore.proxy.ProxyReference SNP);
    public org.intermine.model.InterMineObject proxGetsNP();

    public org.intermine.model.bio.Source getSource();
    public void setSource(final org.intermine.model.bio.Source source);
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source);
    public org.intermine.model.InterMineObject proxGetSource();

    public java.util.Set<org.intermine.model.bio.Gene> getAssociatedGenes();
    public void setAssociatedGenes(final java.util.Set<org.intermine.model.bio.Gene> associatedGenes);
    public void addAssociatedGenes(final org.intermine.model.bio.Gene arg);

}
