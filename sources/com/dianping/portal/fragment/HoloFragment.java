package com.dianping.portal.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import com.dianping.dataservice.mapi.b;
import com.dianping.dataservice.mapi.c;
import com.dianping.dataservice.mapi.f;
import com.dianping.dataservice.mapi.g;
import com.dianping.portal.feature.a;
import com.dianping.portal.feature.d;
import com.dianping.portal.feature.e;
import com.dianping.portal.feature.h;
import com.dianping.portal.feature.i;
import com.dianping.portal.feature.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class HoloFragment extends Fragment implements a, d, e, h, i, j {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<com.dianping.dataservice.mapi.e, com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, f>> mapiRequestMap;

    public void logout() {
    }

    public HoloFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d67dfae54d1b5e59d30ad0d29fa8e7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d67dfae54d1b5e59d30ad0d29fa8e7f");
        } else {
            this.mapiRequestMap = new HashMap();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37f24d7c38f94a446fb0c872689e7df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37f24d7c38f94a446fb0c872689e7df3");
            return;
        }
        for (com.dianping.dataservice.mapi.e eVar : this.mapiRequestMap.keySet()) {
            mapiService().abort(eVar, this.mapiRequestMap.get(eVar), true);
            String simpleName = getClass().getSimpleName();
            com.dianping.util.h.b(simpleName, "abort a request from the map with url: " + eVar.a());
        }
        super.onDestroy();
    }

    public com.dianping.dataservice.mapi.e mapiGet(com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, f> dVar, String str, c cVar) {
        Object[] objArr = {dVar, str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcfb0a75d21dd8e3aa857e329e2a610e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcfb0a75d21dd8e3aa857e329e2a610e");
        }
        com.dianping.dataservice.mapi.e a = b.a(appendUrlParms(str), cVar);
        com.dianping.dataservice.mapi.e findRequest = findRequest(this.mapiRequestMap.keySet(), a);
        if (findRequest != null) {
            mapiService().abort(findRequest, this.mapiRequestMap.get(findRequest), true);
            this.mapiRequestMap.remove(findRequest);
            getClass().getSimpleName();
            new StringBuilder("abort an existed request with the same url: ").append(a.a());
        }
        this.mapiRequestMap.put(a, dVar);
        return a;
    }

    public com.dianping.dataservice.mapi.e mapiPost(com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, f> dVar, String str, String... strArr) {
        Object[] objArr = {dVar, str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3085ac3d286662d2de2e992391b156f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3085ac3d286662d2de2e992391b156f6");
        }
        com.dianping.dataservice.mapi.e a = b.a(str, strArr);
        com.dianping.dataservice.mapi.e findRequest = findRequest(this.mapiRequestMap.keySet(), a);
        if (findRequest != null) {
            mapiService().abort(findRequest, this.mapiRequestMap.get(findRequest), true);
            this.mapiRequestMap.remove(findRequest);
            getClass().getSimpleName();
            new StringBuilder("abort an existed request with the same url: ").append(a.a());
        }
        this.mapiRequestMap.put(a, dVar);
        return a;
    }

    private com.dianping.dataservice.mapi.e findRequest(Set<com.dianping.dataservice.mapi.e> set, com.dianping.dataservice.mapi.e eVar) {
        Object[] objArr = {set, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4008e9a3516ff693547097d5ac7dc539", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4008e9a3516ff693547097d5ac7dc539");
        }
        String a = eVar.a();
        if (a.lastIndexOf(CommonConstant.Symbol.QUESTION_MARK) >= 0) {
            a = a.substring(0, a.lastIndexOf(CommonConstant.Symbol.QUESTION_MARK));
        }
        if (a.length() == 0) {
            return null;
        }
        for (com.dianping.dataservice.mapi.e eVar2 : set) {
            if (eVar2.a().startsWith(a)) {
                return eVar2;
            }
        }
        return null;
    }

    public g mapiService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "075d184e189105d54f489fb811c581d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "075d184e189105d54f489fb811c581d5");
        }
        if (getActivity() instanceof h) {
            return ((h) getActivity()).mapiService();
        }
        return null;
    }

    public String appendUrlParms(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d073cb713f5cdb85e453993702270b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d073cb713f5cdb85e453993702270b") : getActivity() instanceof h ? ((h) getActivity()).appendUrlParms(str) : str;
    }

    public void gotoLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e9576a55cc763669c55cfc317f59f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e9576a55cc763669c55cfc317f59f41");
        } else if (getActivity() instanceof e) {
            ((e) getActivity()).gotoLogin();
        }
    }

    public String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d5e17b3c8b92f32772a9fe8f8471847", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d5e17b3c8b92f32772a9fe8f8471847");
        }
        if (getActivity() instanceof e) {
            return ((e) getActivity()).getToken();
        }
        return null;
    }

    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87eea83a07a052bb71c64725f1f8c336", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87eea83a07a052bb71c64725f1f8c336")).booleanValue();
        }
        if (getActivity() instanceof e) {
            return ((e) getActivity()).isLogin();
        }
        return false;
    }

    public com.dianping.portal.model.a getUser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198a5aee041a6dd4b6e5ccfa371e37ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.portal.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198a5aee041a6dd4b6e5ccfa371e37ca");
        }
        if (getActivity() instanceof e) {
            return ((e) getActivity()).getUser();
        }
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8a7965f4e6d5a5227dc8483c669e124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8a7965f4e6d5a5227dc8483c669e124");
        } else if (!isAdded()) {
            Log.e(getClass().getSimpleName(), "startActivity java.lang.IllegalStateException: Fragment xxx not attached to Activity ");
        } else if (intent == null) {
        } else {
            if (getActivity() instanceof com.dianping.portal.feature.f) {
                getActivity();
            }
            try {
                super.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35acdc43353822566259d01a93969837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35acdc43353822566259d01a93969837");
        } else if (!isAdded()) {
            Log.e(getClass().getSimpleName(), "startActivity java.lang.IllegalStateException: Fragment xxx not attached to Activity ");
        } else if (intent == null) {
        } else {
            if (getActivity() instanceof com.dianping.portal.feature.f) {
                getActivity();
            }
            super.startActivityForResult(intent, i);
        }
    }

    public long cityid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7472feb453cb833ec9b74a431edc644", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7472feb453cb833ec9b74a431edc644")).longValue();
        }
        if (getActivity() instanceof d) {
            return ((d) getActivity()).cityid();
        }
        return -1L;
    }

    public double latitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0da3b07dcc4173212be1c8148ee8ac72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0da3b07dcc4173212be1c8148ee8ac72")).doubleValue();
        }
        if (getActivity() instanceof d) {
            return ((d) getActivity()).latitude();
        }
        return 0.0d;
    }

    public double longitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d754e48a5e2c9b489e13c83589bcb98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d754e48a5e2c9b489e13c83589bcb98")).doubleValue();
        }
        if (getActivity() instanceof d) {
            return ((d) getActivity()).longitude();
        }
        return 0.0d;
    }

    public int getIntParam(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ade1e8ec994531e6680ed9a6a688aba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ade1e8ec994531e6680ed9a6a688aba")).intValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getInt(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, i);
    }

    public int getIntParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7e96b9fb6ddc758c782526746d9cfb5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7e96b9fb6ddc758c782526746d9cfb5")).intValue() : getIntParam(str, 0);
    }

    public boolean getBooleanParam(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ddf9fc11c5b5b71d82f57a1f0d9c0b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ddf9fc11c5b5b71d82f57a1f0d9c0b8")).booleanValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getBoolean(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, z);
    }

    public boolean getBooleanParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41cea42c0082eba58f2404619cc33dec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41cea42c0082eba58f2404619cc33dec")).booleanValue() : getBooleanParam(str, false);
    }

    public long getLongParam(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "202029c80ef1e9d2678ca3fd659beee3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "202029c80ef1e9d2678ca3fd659beee3")).longValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getLong(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, j);
    }

    public long getLongParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cdbaba5a028339c97e970beaace7004", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cdbaba5a028339c97e970beaace7004")).longValue() : getLongParam(str, 0L);
    }

    public double getDoubleParam(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bab14dca17aefeb49b92939e50845cf0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bab14dca17aefeb49b92939e50845cf0")).doubleValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getDouble(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, d);
    }

    public double getDoubleParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe545f456d022cf3d855e2361b3d1830", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe545f456d022cf3d855e2361b3d1830")).doubleValue() : getDoubleParam(str, 0.0d);
    }

    public float getFloatParam(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7f0357cf37d670e7932f15f3ea18fc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7f0357cf37d670e7932f15f3ea18fc9")).floatValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getFloat(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, f);
    }

    public float getFloatParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3c384d5fa31d3fba4737c41ca713c07", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3c384d5fa31d3fba4737c41ca713c07")).floatValue() : getFloatParam(str, 0.0f);
    }

    public char getCharParam(String str, char c) {
        Object[] objArr = {str, Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d279c2a419fbbc74a4b8be29c8371399", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Character) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d279c2a419fbbc74a4b8be29c8371399")).charValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getChar(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, c);
    }

    public char getCharParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95ddb43fc62b28b582eceae8da6c08b3", RobustBitConfig.DEFAULT_VALUE) ? ((Character) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95ddb43fc62b28b582eceae8da6c08b3")).charValue() : getCharParam(str, (char) 0);
    }

    public short getShortParam(String str, short s) {
        Object[] objArr = {str, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f15e425b09d7f24a482b64c45d4756c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f15e425b09d7f24a482b64c45d4756c")).shortValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getShort(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, s);
    }

    public short getShortParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3512be1a44cd45ce10d847318b537d96", RobustBitConfig.DEFAULT_VALUE) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3512be1a44cd45ce10d847318b537d96")).shortValue() : getShortParam(str, (short) 0);
    }

    public byte getByteParam(String str, byte b) {
        Object[] objArr = {str, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6de81f0502fa9a58828b2935626e45cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6de81f0502fa9a58828b2935626e45cb")).byteValue();
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getByte(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str, b);
    }

    public byte getByteParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "643e1c2e257c1c7e5eabe220546ffec0", RobustBitConfig.DEFAULT_VALUE) ? ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "643e1c2e257c1c7e5eabe220546ffec0")).byteValue() : getByteParam(str, (byte) 0);
    }

    public String getStringParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c9fa4fcb18b189ad134634d87b69c2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c9fa4fcb18b189ad134634d87b69c2e");
        }
        if (getArguments() != null && getArguments().containsKey(str)) {
            return getArguments().getString(str);
        }
        return com.dianping.portal.utils.a.a(getActivity().getIntent(), str);
    }

    public String fingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6c0561a9afaa3874db835bafe4c8c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6c0561a9afaa3874db835bafe4c8c59");
        }
        if (getActivity() instanceof j) {
            return ((j) getActivity()).fingerPrint();
        }
        return null;
    }

    public String utmMedium() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71bfc4650fd3afeb2a5ce73f8ec413c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71bfc4650fd3afeb2a5ce73f8ec413c6");
        }
        if (getActivity() instanceof j) {
            return ((j) getActivity()).utmMedium();
        }
        return null;
    }

    public String utmContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2b2054bc7cf467a5f86e5367c3ae472", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2b2054bc7cf467a5f86e5367c3ae472");
        }
        if (getActivity() instanceof j) {
            return ((j) getActivity()).utmContent();
        }
        return null;
    }

    public String utmCampaign() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f35c9733bb97bbeb17866573d34ebaaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f35c9733bb97bbeb17866573d34ebaaa");
        }
        if (getActivity() instanceof j) {
            return ((j) getActivity()).utmCampaign();
        }
        return null;
    }

    public String utmSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a99afc8973cc65a8874327bccf2898e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a99afc8973cc65a8874327bccf2898e");
        }
        if (getActivity() instanceof j) {
            return ((j) getActivity()).utmSource();
        }
        return null;
    }

    public String utmTerm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "358e19a7c52b3984d2e9fd5c058bee3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "358e19a7c52b3984d2e9fd5c058bee3c");
        }
        if (getActivity() instanceof j) {
            return ((j) getActivity()).utmTerm();
        }
        return null;
    }

    public void setBarTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79bdf2ef67c4689fb066181f827b62e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79bdf2ef67c4689fb066181f827b62e6");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setBarTitle(charSequence);
        }
    }

    public void setBarSubtitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb6b5ba94bab052d2abf0c3f157d64db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb6b5ba94bab052d2abf0c3f157d64db");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setBarSubtitle(charSequence);
        }
    }

    public void setTitlebarBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d67f2ba7bd4bb50113819cb6d3b5e09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d67f2ba7bd4bb50113819cb6d3b5e09d");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setTitlebarBackground(drawable);
        }
    }

    public void showTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4895f4060bb709181e67fbe5f90ab9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4895f4060bb709181e67fbe5f90ab9c");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).showTitlebar();
        }
    }

    public void hideTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca9e5228d2ae2d2dac6bbce699c4c223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca9e5228d2ae2d2dac6bbce699c4c223");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).hideTitlebar();
        }
    }

    public void addRightViewItem(View view, String str, View.OnClickListener onClickListener) {
        Object[] objArr = {view, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58c856c05ae59b9bb46aca6f21779a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58c856c05ae59b9bb46aca6f21779a33");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).addRightViewItem(view, str, onClickListener);
        }
    }

    public void removeRightViewItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cd6309692e6def020d07e76061c9ab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cd6309692e6def020d07e76061c9ab5");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).removeRightViewItem(str);
        }
    }

    public void removeAllRightViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35480eac5bc2319b75735b4dd997d238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35480eac5bc2319b75735b4dd997d238");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).removeAllRightViewItem();
        }
    }

    public View findRightViewItemByTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf78cd7c7553d935e4c7f6c3b22e6250", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf78cd7c7553d935e4c7f6c3b22e6250");
        }
        if (getActivity() instanceof i) {
            return ((i) getActivity()).findRightViewItemByTag(str);
        }
        return null;
    }

    public void setTitleCustomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1404dcf81fc10335ce607953f98ca61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1404dcf81fc10335ce607953f98ca61d");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setTitleCustomView(view);
        }
    }

    public void setTitleCustomView(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4040f4b442ea7a0bebed445c05cd3327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4040f4b442ea7a0bebed445c05cd3327");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setTitleCustomView(view, true, false);
        }
    }

    public void setShowLeftButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ae2424cd9b6e65c221e4e52f11e9eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ae2424cd9b6e65c221e4e52f11e9eaf");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setShowLeftButton(z);
        }
    }

    public void setShowRightButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad10aefe952ea6d93e757bcb3a9ef24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad10aefe952ea6d93e757bcb3a9ef24");
        } else if (getActivity() instanceof i) {
            ((i) getActivity()).setShowRightButton(z);
        }
    }

    public void bindCaptureProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd22e696a56fadfb5a35f8cfc724f4d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd22e696a56fadfb5a35f8cfc724f4d5");
        } else if (getActivity() instanceof a) {
            ((a) getActivity()).bindCaptureProvider();
        }
    }
}
