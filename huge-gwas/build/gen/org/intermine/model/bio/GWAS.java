package org.intermine.model.bio;

public interface GWAS extends org.intermine.model.InterMineObject
{
    public java.lang.Integer getYear();
    public void setYear(final java.lang.Integer year);

    public java.lang.String getInitialSample();
    public void setInitialSample(final java.lang.String initialSample);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getFirstAuthor();
    public void setFirstAuthor(final java.lang.String firstAuthor);

    public java.lang.String getReplicateSample();
    public void setReplicateSample(final java.lang.String replicateSample);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.GWASResult> getResults();
    public void setResults(final java.util.Set<org.intermine.model.bio.GWASResult> results);
    public void addResults(final org.intermine.model.bio.GWASResult arg);

}
