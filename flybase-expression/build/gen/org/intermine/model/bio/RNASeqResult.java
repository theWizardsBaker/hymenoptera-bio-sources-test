package org.intermine.model.bio;

public interface RNASeqResult extends org.intermine.model.InterMineObject
{
    public java.lang.Double getExpressionScore();
    public void setExpressionScore(final java.lang.Double expressionScore);

    public java.lang.String getExpressionLevel();
    public void setExpressionLevel(final java.lang.String expressionLevel);

    public java.lang.String getStage();
    public void setStage(final java.lang.String stage);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
