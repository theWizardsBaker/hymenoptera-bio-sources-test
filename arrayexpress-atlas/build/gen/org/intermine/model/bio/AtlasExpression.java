package org.intermine.model.bio;

public interface AtlasExpression extends org.intermine.model.InterMineObject
{
    public java.lang.Double getTStatistic();
    public void setTStatistic(final java.lang.Double tStatistic);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getCondition();
    public void setCondition(final java.lang.String condition);

    public java.lang.String getExpression();
    public void setExpression(final java.lang.String expression);

    public java.lang.Double getPValue();
    public void setPValue(final java.lang.Double pValue);

    public org.intermine.model.bio.ProbeSet getProbe();
    public void setProbe(final org.intermine.model.bio.ProbeSet probe);
    public void proxyProbe(final org.intermine.objectstore.proxy.ProxyReference probe);
    public org.intermine.model.InterMineObject proxGetProbe();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}
