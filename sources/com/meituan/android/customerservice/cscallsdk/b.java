package com.meituan.android.customerservice.cscallsdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public String b;
        public long c;
        public int d;
        public boolean e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c {
        public String a;
        public ArrayList<e> b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d extends a {
        public int f;
        public String g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e {
        public String a;
        public String b;
    }

    void onAcceptInviteTimeout(a aVar);

    void onApp2PhoneChange(c cVar);

    void onCallEnd(d dVar);

    void onCallEstablishing(a aVar);

    void onError(d dVar);

    void onInvited(f fVar);

    void onJoinCallRes(d dVar);

    void onMakeCallSuccess(a aVar);

    void onMakeCallTimeout(a aVar);

    void onNetQualityChange(g gVar);

    void onOtherDeviceAccept(int i);

    void onOtherDeviceReject(int i);

    void onRejoinSuccess(a aVar);

    void onTalking();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class f extends a {
        public static ChangeQuickRedirect f;
        public ArrayList<com.meituan.android.customerservice.callbase.base.f> g;
        public long h;
        public byte i;
        public int j;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36dab205a47bd0c10c8b57458b317a3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36dab205a47bd0c10c8b57458b317a3");
            }
            return "gid " + this.c + ", sid " + this.a + ", calltype " + ((int) this.i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class g extends a {
        public static ChangeQuickRedirect f;
        public String g;
        public com.meituan.android.customerservice.callbase.base.d[] h;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc3564583867b1ab7406eb04d50ca1a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc3564583867b1ab7406eb04d50ca1a");
            }
            return Message.SID + this.g + " netQuaty " + this.h[0].toString();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.cscallsdk.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0244b implements b {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected b mListener;

        public void onRingCall(String str) {
        }

        public C0244b(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb52be11e8b9ddbc456bf833314ad5e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb52be11e8b9ddbc456bf833314ad5e3");
            } else {
                this.mListener = bVar;
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onMakeCallSuccess(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "417ed9f1700a9ab970471aa6e26de4f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "417ed9f1700a9ab970471aa6e26de4f1");
            } else if (this.mListener != null) {
                this.mListener.onMakeCallSuccess(aVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onMakeCallTimeout(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bb4e1df98922312741c8a23d3dc9a17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bb4e1df98922312741c8a23d3dc9a17");
            } else if (this.mListener != null) {
                this.mListener.onMakeCallTimeout(aVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onAcceptInviteTimeout(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99e23ad2d92e58a3b4042a65eca4a649", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99e23ad2d92e58a3b4042a65eca4a649");
            } else if (this.mListener != null) {
                this.mListener.onAcceptInviteTimeout(aVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onJoinCallRes(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62daba08bf68fc68cce05fd2276ada38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62daba08bf68fc68cce05fd2276ada38");
            } else if (this.mListener != null) {
                this.mListener.onJoinCallRes(dVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onInvited(f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "521d85f3c4b2438f3b5b6a2de682192c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "521d85f3c4b2438f3b5b6a2de682192c");
            } else if (this.mListener != null) {
                this.mListener.onInvited(fVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onCallEstablishing(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a6543f58e92bfb7efb59251253ecc4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a6543f58e92bfb7efb59251253ecc4f");
            } else if (this.mListener != null) {
                this.mListener.onCallEstablishing(aVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onRejoinSuccess(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62095fc288f6e10f920114d82db74cfd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62095fc288f6e10f920114d82db74cfd");
            } else if (this.mListener != null) {
                this.mListener.onRejoinSuccess(aVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onTalking() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fabfde59c15642ad6449db4deb709668", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fabfde59c15642ad6449db4deb709668");
            } else if (this.mListener != null) {
                this.mListener.onTalking();
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onOtherDeviceAccept(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34580e392db34e17a4a857ae01bde804", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34580e392db34e17a4a857ae01bde804");
            } else if (this.mListener != null) {
                this.mListener.onOtherDeviceAccept(i);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onOtherDeviceReject(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "533c8e00ad49c244b353278fb3d799b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "533c8e00ad49c244b353278fb3d799b1");
            } else if (this.mListener != null) {
                this.mListener.onOtherDeviceReject(i);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onNetQualityChange(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ae22cde755ee9a2812aa581548bca39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ae22cde755ee9a2812aa581548bca39");
            } else if (this.mListener != null) {
                this.mListener.onNetQualityChange(gVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onError(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a4cd008108d20fa88ec4b218d32275", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a4cd008108d20fa88ec4b218d32275");
            } else if (this.mListener != null) {
                this.mListener.onError(dVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onCallEnd(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "850febb03080f05e1e2a059f4c0e6c9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "850febb03080f05e1e2a059f4c0e6c9d");
            } else if (this.mListener != null) {
                this.mListener.onCallEnd(dVar);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b
        public void onApp2PhoneChange(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21db39f4d4a161b2ae2355af27ea711f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21db39f4d4a161b2ae2355af27ea711f");
            } else if (this.mListener != null) {
                this.mListener.onApp2PhoneChange(cVar);
            }
        }
    }
}
