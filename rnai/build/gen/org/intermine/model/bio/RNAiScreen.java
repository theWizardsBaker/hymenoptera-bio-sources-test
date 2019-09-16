package org.intermine.model.bio;

public interface RNAiScreen extends org.intermine.model.InterMineObject
{
    public java.lang.String getBioSourceType();
    public void setBioSourceType(final java.lang.String bioSourceType);

    public java.lang.String getMethod();
    public void setMethod(final java.lang.String method);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.String getBioSourceName();
    public void setBioSourceName(final java.lang.String bioSourceName);

    public java.lang.String getScoreType();
    public void setScoreType(final java.lang.String scoreType);

    public java.lang.String getAssay();
    public void setAssay(final java.lang.String assay);

    public java.lang.String getScoreCutoff();
    public void setScoreCutoff(final java.lang.String scoreCutoff);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getReagentType();
    public void setReagentType(final java.lang.String reagentType);

    public java.lang.String getLibrary();
    public void setLibrary(final java.lang.String library);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.RNAiResult> getRnaiResults();
    public void setRnaiResults(final java.util.Set<org.intermine.model.bio.RNAiResult> rnaiResults);
    public void addRnaiResults(final org.intermine.model.bio.RNAiResult arg);

}
