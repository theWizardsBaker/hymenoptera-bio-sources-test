package org.intermine.model.bio;

public interface ProteinAtlasExpression extends org.intermine.model.InterMineObject
{
    public java.lang.String getExpressionType();
    public void setExpressionType(final java.lang.String expressionType);

    public java.lang.String getLevel();
    public void setLevel(final java.lang.String level);

    public java.lang.String getCellType();
    public void setCellType(final java.lang.String cellType);

    public java.lang.String getReliability();
    public void setReliability(final java.lang.String reliability);

    public org.intermine.model.bio.Tissue getTissue();
    public void setTissue(final org.intermine.model.bio.Tissue tissue);
    public void proxyTissue(final org.intermine.objectstore.proxy.ProxyReference tissue);
    public org.intermine.model.InterMineObject proxGetTissue();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
