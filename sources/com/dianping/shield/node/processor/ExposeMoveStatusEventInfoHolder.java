package com.dianping.shield.node.processor;

import android.support.annotation.NonNull;
import com.dianping.agentsdk.framework.f;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposeMoveStatusEventInfoHolder implements ShieldPreloadInterface {
    public static final int NO_COUNT = 0;
    public static final long NO_TIME = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<Object, MoveStatusEventInfo> map;
    private f.a pageExposeComputeMode;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class MoveStatusEventInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count = 0;
        public long lastTimeMillis = 0;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public ExposeMoveStatusEventInfoHolder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6db7b916381d8db2de324c7701b4bb5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6db7b916381d8db2de324c7701b4bb5a");
            return;
        }
        this.map = new HashMap<>();
        this.pageExposeComputeMode = f.a.Normal;
    }

    public void reset(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fecad54e9f5f900561a83116f607149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fecad54e9f5f900561a83116f607149");
        } else {
            this.map.remove(obj);
        }
    }

    public void setCount(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a32a8a578d43877f352719b2b2d7748c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a32a8a578d43877f352719b2b2d7748c");
        } else if (obj == null) {
        } else {
            MoveStatusEventInfo moveStatusEventInfo = this.map.get(obj);
            if (moveStatusEventInfo == null) {
                moveStatusEventInfo = new MoveStatusEventInfo();
            }
            moveStatusEventInfo.count = i;
            this.map.put(obj, moveStatusEventInfo);
        }
    }

    public int getCount(Object obj) {
        MoveStatusEventInfo moveStatusEventInfo;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fea74fc5e6befcc96faf83a562144afe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fea74fc5e6befcc96faf83a562144afe")).intValue();
        }
        if (obj == null || (moveStatusEventInfo = this.map.get(obj)) == null) {
            return 0;
        }
        return moveStatusEventInfo.count;
    }

    public void setLastTimeMillis(Object obj, long j) {
        Object[] objArr = {obj, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84030e46729e8e695e7481fc7f389f70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84030e46729e8e695e7481fc7f389f70");
        } else if (obj == null) {
        } else {
            MoveStatusEventInfo moveStatusEventInfo = this.map.get(obj);
            if (moveStatusEventInfo == null) {
                moveStatusEventInfo = new MoveStatusEventInfo();
            }
            moveStatusEventInfo.lastTimeMillis = j;
            this.map.put(obj, moveStatusEventInfo);
        }
    }

    public long getLastTimeMillis(Object obj) {
        MoveStatusEventInfo moveStatusEventInfo;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c58d98a2b325b0f0f0b01428374b9b83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c58d98a2b325b0f0f0b01428374b9b83")).longValue();
        }
        if (obj == null || (moveStatusEventInfo = this.map.get(obj)) == null) {
            return 0L;
        }
        return moveStatusEventInfo.lastTimeMillis;
    }

    public f.a getPageExposeComputeMode() {
        return this.pageExposeComputeMode;
    }

    public void setPageExposeComputeMode(@NonNull f.a aVar) {
        this.pageExposeComputeMode = aVar;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f68f579fdc20747480ab3d576c60a7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f68f579fdc20747480ab3d576c60a7b6");
            return;
        }
        this.map.clear();
        this.pageExposeComputeMode = f.a.Normal;
    }
}
