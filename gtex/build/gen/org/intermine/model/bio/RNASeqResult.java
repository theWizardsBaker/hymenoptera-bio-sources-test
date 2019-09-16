package org.intermine.model.bio;

public interface RNASeqResult extends org.intermine.model.InterMineObject
{
    public java.lang.String getTissue();
    public void setTissue(final java.lang.String tissue);

    public java.lang.Double getExpressionScore();
    public void setExpressionScore(final java.lang.Double expressionScore);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
