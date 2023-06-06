package com.meituan.android.common.statistics.sfrom;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SFromManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<SFromNode> list;
    private ReentrantReadWriteLock mReadWriteLock;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static SFromManager instance = new SFromManager();
    }

    public SFromManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91964b2c83ba760b8242b1387f0be306", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91964b2c83ba760b8242b1387f0be306");
            return;
        }
        this.mReadWriteLock = new ReentrantReadWriteLock();
        this.list = new ArrayList();
    }

    public static SFromManager getInstance() {
        return Holder.instance;
    }

    public void addNewSFrom(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95de62710e4e5a2c680fe5b12eaa0dfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95de62710e4e5a2c680fe5b12eaa0dfe");
        } else if (jSONObject == null) {
        } else {
            String optString = jSONObject.optString("cid");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            try {
                try {
                    this.mReadWriteLock.writeLock().lock();
                    SFromNode sFromNode = new SFromNode();
                    sFromNode.setCid(optString);
                    sFromNode.setSfrom(jSONObject);
                    this.list.add(sFromNode);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                this.mReadWriteLock.writeLock().unlock();
            }
        }
    }

    public JSONArray getSFrom() {
        JSONObject sfrom;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6b04d96f76db80d2ebfae199d8218a7", 6917529027641081856L)) {
                return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6b04d96f76db80d2ebfae199d8218a7");
            }
            try {
                this.mReadWriteLock.readLock().lock();
                JSONArray jSONArray = new JSONArray();
                int size = this.list.size();
                for (int i = 0; i < size; i++) {
                    SFromNode sFromNode = this.list.get(i);
                    if (sFromNode != null && (sfrom = sFromNode.getSfrom()) != null) {
                        jSONArray.put(sfrom);
                    }
                }
                return jSONArray;
            } catch (Exception e) {
                e.printStackTrace();
                this.mReadWriteLock.readLock().unlock();
                return null;
            }
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public boolean hasSFrom() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c08ebf22df27f1451d58678d8dbc4982", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c08ebf22df27f1451d58678d8dbc4982")).booleanValue();
        }
        try {
            this.mReadWriteLock.readLock().lock();
            if (this.list != null) {
                if (this.list.size() > 0) {
                    z = true;
                }
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.mReadWriteLock.readLock().unlock();
        }
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef01ec76a3f87d6f3224ab0ec1573d66", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef01ec76a3f87d6f3224ab0ec1573d66");
                return;
            }
            try {
                this.mReadWriteLock.writeLock().lock();
                if (this.list != null) {
                    this.list.clear();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.mReadWriteLock.writeLock().unlock();
        }
    }
}
