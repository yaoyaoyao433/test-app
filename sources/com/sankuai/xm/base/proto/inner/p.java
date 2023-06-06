package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class p extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f834d4dffd2e311879e99761bdd525", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f834d4dffd2e311879e99761bdd525");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd2dd9c2aaab202e145e1dba7364e93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd2dd9c2aaab202e145e1dba7364e93");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede84924c2cbbdefaa170f175ec73fce", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede84924c2cbbdefaa170f175ec73fce");
        }
        return "PQuoteInfo{selectedMessage=" + this.b + ", quotedMessages='" + this.c + ", searchText='" + this.d + '}';
    }
}
