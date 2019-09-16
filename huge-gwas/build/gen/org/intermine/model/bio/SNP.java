package org.intermine.model.bio;

public interface SNP extends org.intermine.model.bio.SequenceFeature
{
    public java.util.Set<org.intermine.model.bio.GWASResult> getgWASResults();
    public void setgWASResults(final java.util.Set<org.intermine.model.bio.GWASResult> GWASResults);
    public void addgWASResults(final org.intermine.model.bio.GWASResult arg);

}
