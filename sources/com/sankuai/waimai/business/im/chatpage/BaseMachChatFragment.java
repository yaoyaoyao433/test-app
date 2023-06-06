package com.sankuai.waimai.business.im.chatpage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.i;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseMachChatFragment extends BasePvChatFragment implements com.sankuai.waimai.business.im.common.contract.a, IMClient.i {
    public static ChangeQuickRedirect a;
    private Dialog A;
    public WMCommonDataInfo b;
    protected com.sankuai.waimai.business.im.common.presenter.a c;
    protected com.sankuai.waimai.business.im.delegate.b d;
    protected SessionId e;
    protected boolean f;
    protected boolean g;
    private volatile Map<String, Object> k;
    private volatile Map<String, Object> l;
    private Bundle m;
    private volatile boolean y;
    private volatile boolean z;

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public Map<String, Object> a(String str, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void a(i iVar) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(long j) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(IMMessage iMMessage) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b(boolean z) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void b_(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public void c(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment
    public final boolean g() {
        return true;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public int p() {
        return -1;
    }

    public BaseMachChatFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21156a99382b0a2d9ebfa44005b6423d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21156a99382b0a2d9ebfa44005b6423d");
            return;
        }
        this.k = new HashMap();
        this.l = new HashMap();
        this.e = null;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.BasePvChatFragment, com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7d721921308ee1658dcf94ba067d0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7d721921308ee1658dcf94ba067d0c");
            return;
        }
        super.onCreate(bundle);
        this.m = getArguments();
        this.e = (SessionId) this.m.getParcelable("SessionId");
        this.d = new com.sankuai.waimai.business.im.delegate.b();
        this.d.a();
        com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-im");
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751787611bfce7b94390687364b18fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751787611bfce7b94390687364b18fba");
            return;
        }
        super.onDestroy();
        if (this.d != null) {
            this.d.c();
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a50780985fd27f4dcceb6b47dd3a3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a50780985fd27f4dcceb6b47dd3a3a")).booleanValue();
        }
        if (this.c != null && bVar != null && bVar.b != 0 && bVar.b.getMsgType() == 17) {
            this.c.a(bVar.b);
        }
        return super.a(bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.session.c.b
    public final void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        c.a aVar;
        View B;
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefa66fb8e4831ee128e5effa5f6f740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefa66fb8e4831ee128e5effa5f6f740");
            return;
        }
        if (this.b != null && this.b.a) {
            if (i2 == 1 && (B = B()) != null) {
                B.setVisibility(0);
            }
            if ((i2 == 1 || i2 == 2 || i2 == 4) && (aVar = this.u) != null) {
                int c = com.sankuai.waimai.foundation.utils.b.c(aVar.c());
                if (this.c != null && this.c.a(c)) {
                    this.c.a();
                }
            }
        }
        super.a(i, str, list, i2, z);
    }

    private View B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f721851b60bd3d9f4617bb232e85eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f721851b60bd3d9f4617bb232e85eb");
        }
        if (getView() != null) {
            try {
                return getView().findViewById(R.id.xm_sdk_msg_list);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final void a(com.sankuai.waimai.business.im.delegate.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d9f27f7882381018fb096670ec8959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d9f27f7882381018fb096670ec8959");
        } else if (this.d != null) {
            this.d.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    @NonNull
    public final Map<String, Object> h() {
        return this.k;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final Map<String, Object> ak_() {
        return this.l;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final WMCommonDataInfo j() {
        return this.b;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final void aj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101c1e93a2626dbf5d84723051cafb9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101c1e93a2626dbf5d84723051cafb9f");
            return;
        }
        View B = B();
        if (B != null && !this.y) {
            A();
            y();
            this.y = true;
        }
        if (B != null) {
            B.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "834b277f6c2fd1bddc7288a09b271729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "834b277f6c2fd1bddc7288a09b271729");
            return;
        }
        View view = getView();
        if (view == null || !this.g) {
            return;
        }
        this.A = com.sankuai.waimai.foundation.core.utils.d.a((Activity) getActivity());
        view.setVisibility(4);
        this.g = false;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final void ai_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c657f750611e06db226d88f9fa57bcd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c657f750611e06db226d88f9fa57bcd0");
            return;
        }
        View view = getView();
        if (view == null || !this.f) {
            return;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.A);
        view.setVisibility(0);
        this.f = false;
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final void ah_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4900d89cfe5bf253913d9a0d76891bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4900d89cfe5bf253913d9a0d76891bd1");
        } else if (getHost() == null || this.z) {
        } else {
            y();
            View view = getView();
            if (view != null) {
                view.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.chatpage.BaseMachChatFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86b1303631b97bbb1943a288e84058fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86b1303631b97bbb1943a288e84058fa");
                        } else {
                            BaseMachChatFragment.this.y();
                        }
                    }
                }, 100L);
            }
            this.z = true;
        }
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bae22cb4e2b0b43f800825212cb55b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bae22cb4e2b0b43f800825212cb55b3");
        } else if (getActivity() == null || f.a(getActivity())) {
        } else {
            k.b(getView(), 0);
            getActivity().finish();
        }
    }

    @Override // com.sankuai.xm.im.IMClient.i
    public void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7ce586cceefd267b9f5c1f6dc2a4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7ce586cceefd267b9f5c1f6dc2a4bb");
        } else if (com.sankuai.waimai.foundation.utils.b.a(list) && this.c != null) {
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                if (iMMessage != null && iMMessage.getMsgType() == 17 && this.e != null && iMMessage.getChatId() == this.e.b) {
                    arrayList.add(iMMessage);
                }
            }
            this.c.a(arrayList);
        }
    }
}
