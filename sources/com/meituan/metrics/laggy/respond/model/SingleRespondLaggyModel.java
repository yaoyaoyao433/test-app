package com.meituan.metrics.laggy.respond.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SingleRespondLaggyModel {
    private static final int LAGGY_MAX_TIMES = 50;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String biz;
    private final String bundleName;
    private final String bundleVersion;
    private final String componentName;
    private final boolean isNative;
    private int laggyCount;
    private final List<Long> laggyTime;
    private final String pageName;
    private int respondCount;

    public SingleRespondLaggyModel(String str) {
        this(str, null, null, null, null);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "130cdae25b1bf34a274933546068f2c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "130cdae25b1bf34a274933546068f2c9");
        }
    }

    public SingleRespondLaggyModel(String str, String str2, String str3, String str4) {
        this(null, str, str2, str3, str4);
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eb6ab1342a42db9217454ce28b78ae2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eb6ab1342a42db9217454ce28b78ae2");
        }
    }

    public SingleRespondLaggyModel(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31cb9ec0f43963cc5c85945a03f1557", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31cb9ec0f43963cc5c85945a03f1557");
            return;
        }
        this.laggyCount = 0;
        this.respondCount = 0;
        this.isNative = str != null;
        this.pageName = str;
        this.biz = str2;
        this.bundleName = str3;
        this.componentName = str4;
        this.bundleVersion = str5;
        this.laggyTime = Collections.synchronizedList(new ArrayList());
    }

    public void addLaggyTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9b77e6921488f4a20741f37a704f15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9b77e6921488f4a20741f37a704f15d");
            return;
        }
        this.laggyCount++;
        if (this.laggyTime.size() >= 50) {
            this.laggyTime.remove(0);
        }
        this.laggyTime.add(Long.valueOf(j));
    }

    public void addOnesRespond() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35052a324649cd54549258349703b9ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35052a324649cd54549258349703b9ed");
        } else {
            this.respondCount++;
        }
    }

    public int getLaggyCount() {
        return this.laggyCount;
    }

    public void addReportData(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d41d46ef8d9f862fdc0ac5739c7457c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d41d46ef8d9f862fdc0ac5739c7457c");
        } else if (this.isNative) {
            map.put("native_name", this.pageName);
            map.put("native_count", Integer.valueOf(this.respondCount));
            map.put("native_laggy_count", Integer.valueOf(this.laggyCount));
            map.put("native_laggy", this.laggyTime.toArray());
        } else {
            map.put("mrn_name", this.bundleName);
            map.put("mrn_biz", this.biz);
            map.put("mrn_component", this.componentName);
            map.put("mrn_bundle_version", this.bundleVersion);
            map.put("mrn_count", Integer.valueOf(this.respondCount));
            map.put("mrn_laggy_count", Integer.valueOf(this.laggyCount));
            map.put("mrn_laggy", this.laggyTime.toArray());
        }
    }
}
