package org.intermine.model.bio;

public interface RNAiResult extends org.intermine.model.InterMineObject
{
    public java.lang.String getPhenotype();
    public void setPhenotype(final java.lang.String phenotype);

    public java.lang.String getReagentId();
    public void setReagentId(final java.lang.String reagentId);

    public java.lang.String getScore();
    public void setScore(final java.lang.String score);

    public java.lang.String getConditions();
    public void setConditions(final java.lang.String conditions);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.RNAiScreen getRnaiScreen();
    public void setRnaiScreen(final org.intermine.model.bio.RNAiScreen rnaiScreen);
    public void proxyRnaiScreen(final org.intermine.objectstore.proxy.ProxyReference rnaiScreen);
    public org.intermine.model.InterMineObject proxGetRnaiScreen();

}
