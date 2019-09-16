package org.intermine.model.bio;

public interface xRef extends org.intermine.model.InterMineObject
{
    public java.lang.String getSource();
    public void setSource(final java.lang.String source);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getRefereeSource();
    public void setRefereeSource(final java.lang.String refereeSource);

    public org.intermine.model.bio.Gene getReferee();
    public void setReferee(final org.intermine.model.bio.Gene referee);
    public void proxyReferee(final org.intermine.objectstore.proxy.ProxyReference referee);
    public org.intermine.model.InterMineObject proxGetReferee();

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public org.intermine.model.bio.Gene getReferrer();
    public void setReferrer(final org.intermine.model.bio.Gene referrer);
    public void proxyReferrer(final org.intermine.objectstore.proxy.ProxyReference referrer);
    public org.intermine.model.InterMineObject proxGetReferrer();

}
