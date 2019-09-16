package org.intermine.model.bio;

public interface ChromosomalDeletion extends org.intermine.model.InterMineObject
{
    public java.lang.Boolean getAvailable();
    public void setAvailable(final java.lang.Boolean available);

    public java.lang.Boolean getConfirmedByGenetics();
    public void setConfirmedByGenetics(final java.lang.Boolean confirmedByGenetics);

    public java.lang.Boolean getConfirmedByPCR();
    public void setConfirmedByPCR(final java.lang.Boolean confirmedByPCR);

    public org.intermine.model.bio.TransposableElementInsertionSite getElement2();
    public void setElement2(final org.intermine.model.bio.TransposableElementInsertionSite element2);
    public void proxyElement2(final org.intermine.objectstore.proxy.ProxyReference element2);
    public org.intermine.model.InterMineObject proxGetElement2();

    public org.intermine.model.bio.TransposableElementInsertionSite getElement1();
    public void setElement1(final org.intermine.model.bio.TransposableElementInsertionSite element1);
    public void proxyElement1(final org.intermine.objectstore.proxy.ProxyReference element1);
    public org.intermine.model.InterMineObject proxGetElement1();

}
