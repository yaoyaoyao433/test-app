package com.sankuai.meituan.retrofit2.raw;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.r;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {
    ap body();

    int code();

    @Nullable
    List<q> headers();

    String reason();

    String url();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        String b;
        public int c;
        String d;
        public ap e;
        public r.a f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44043fe6655f85eb91224c549e3c3407", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44043fe6655f85eb91224c549e3c3407");
                return;
            }
            this.c = -1;
            this.f = new r.a();
        }

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6062fc8e3e1571388d736abe8f6d8641", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6062fc8e3e1571388d736abe8f6d8641");
                return;
            }
            this.c = -1;
            this.b = bVar.url();
            this.c = bVar.code();
            this.d = bVar.reason();
            this.e = bVar.body();
            if (bVar.headers() == null) {
                this.f = new r.a();
            } else {
                this.f = new r.a().a(bVar.headers());
            }
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a a(int i) {
            this.c = i;
            return this;
        }

        public final a b(String str) {
            this.d = str;
            return this;
        }

        public final a a(ap apVar) {
            this.e = apVar;
            return this;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "726f157f1000e1c93ec151e59caf49f3", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "726f157f1000e1c93ec151e59caf49f3");
            }
            if (this.c < 0) {
                throw new IllegalStateException("code < 0: " + this.c);
            }
            return new b() { // from class: com.sankuai.meituan.retrofit2.raw.b.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final String url() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26af23015de7e6a8db49324ff3edeff3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26af23015de7e6a8db49324ff3edeff3") : a.this.b;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final int code() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b318a0b6c4b1eac5f63741562fee24ef", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b318a0b6c4b1eac5f63741562fee24ef")).intValue() : a.this.c;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final String reason() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83856da4c862201eee1f9d18abd3bb91", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83856da4c862201eee1f9d18abd3bb91") : a.this.d;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                @Nullable
                public final List<q> headers() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9019aeb6e3e8bce4fe179d7878b309e", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9019aeb6e3e8bce4fe179d7878b309e") : a.this.f.a().b;
                }

                @Override // com.sankuai.meituan.retrofit2.raw.b
                public final ap body() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84470ffb9105fc91b79525b11604945a", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84470ffb9105fc91b79525b11604945a") : a.this.e;
                }
            };
        }
    }
}
