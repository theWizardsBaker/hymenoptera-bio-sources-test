package org.intermine.model.bio;

public interface MRNAExpressionResult extends org.intermine.model.InterMineObject
{
    public java.lang.Boolean getExpressed();
    public void setExpressed(final java.lang.Boolean expressed);

    public java.lang.String getStageRange();
    public void setStageRange(final java.lang.String stageRange);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public org.intermine.model.bio.DataSet getDataSet();
    public void setDataSet(final org.intermine.model.bio.DataSet dataSet);
    public void proxyDataSet(final org.intermine.objectstore.proxy.ProxyReference dataSet);
    public org.intermine.model.InterMineObject proxGetDataSet();

    public java.util.Set<org.intermine.model.bio.Image> getImages();
    public void setImages(final java.util.Set<org.intermine.model.bio.Image> images);
    public void addImages(final org.intermine.model.bio.Image arg);

    public java.util.Set<org.intermine.model.bio.DevelopmentTerm> getStages();
    public void setStages(final java.util.Set<org.intermine.model.bio.DevelopmentTerm> stages);
    public void addStages(final org.intermine.model.bio.DevelopmentTerm arg);

    public java.util.Set<org.intermine.model.bio.OntologyTerm> getMRNAExpressionTerms();
    public void setMRNAExpressionTerms(final java.util.Set<org.intermine.model.bio.OntologyTerm> mRNAExpressionTerms);
    public void addMRNAExpressionTerms(final org.intermine.model.bio.OntologyTerm arg);

}
