package com.meituan.android.common.aidata.cep.rule;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.aidata.cep.rule.cep.CepRuleTrigger;
import com.meituan.android.common.aidata.data.DataManager;
import com.meituan.android.common.aidata.data.api.EventFilterListener;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.resources.manager.CepResourceManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.flink.cep.mlink.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RuleTriggerManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile RuleTriggerManager sInstance;
    private ConcurrentHashMap<String, IRuleTrigger> mRuleTriggerMap;

    public RuleTriggerManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5deaadb292b189fa38990ff0acdb1b82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5deaadb292b189fa38990ff0acdb1b82");
            return;
        }
        this.mRuleTriggerMap = null;
        this.mRuleTriggerMap = new ConcurrentHashMap<>();
        DataManager.getInstance().subscribeDataInner(null, new EventFilterListener() { // from class: com.meituan.android.common.aidata.cep.rule.RuleTriggerManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.data.api.EventFilterListener
            public void onData(EventData eventData) {
                Object[] objArr2 = {eventData};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5e6cbcb731d29947a775aff0899eb07c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5e6cbcb731d29947a775aff0899eb07c");
                    return;
                }
                new StringBuilder("cep input stream data:").append(eventData != null ? eventData.toString() : "event is null");
                if (RuleTriggerManager.this.mRuleTriggerMap == null || RuleTriggerManager.this.mRuleTriggerMap.size() <= 0) {
                    return;
                }
                for (IRuleTrigger iRuleTrigger : RuleTriggerManager.this.mRuleTriggerMap.values()) {
                    if (iRuleTrigger.iStarted() && CepResourceManager.getInstance().isValid(iRuleTrigger, eventData)) {
                        iRuleTrigger.run(eventData);
                    }
                }
            }
        });
    }

    public static RuleTriggerManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3467a0c3723401dd8afe0bbc895b5e8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RuleTriggerManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3467a0c3723401dd8afe0bbc895b5e8d");
        }
        if (sInstance == null) {
            synchronized (RuleTriggerManager.class) {
                if (sInstance == null) {
                    sInstance = new RuleTriggerManager();
                }
            }
        }
        return sInstance;
    }

    public void addRuleTrigger(IRuleTrigger iRuleTrigger) {
        Object[] objArr = {iRuleTrigger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb362ff07d0af0c3fc158c51e31456c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb362ff07d0af0c3fc158c51e31456c1");
        } else if (iRuleTrigger == null || TextUtils.isEmpty(iRuleTrigger.getIdentifier()) || this.mRuleTriggerMap.containsKey(iRuleTrigger.getIdentifier())) {
        } else {
            this.mRuleTriggerMap.put(iRuleTrigger.getIdentifier(), iRuleTrigger);
        }
    }

    public boolean hasAdded(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f969930ec52a980b91896a0c8e7fbd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f969930ec52a980b91896a0c8e7fbd8")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.mRuleTriggerMap.containsKey(str);
    }

    public void replaceRuleTrigger(IRuleTrigger iRuleTrigger) {
        Object[] objArr = {iRuleTrigger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92d312b5bfbef190656b9b13a81befb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92d312b5bfbef190656b9b13a81befb");
        } else if (iRuleTrigger == null || TextUtils.isEmpty(iRuleTrigger.getIdentifier())) {
        } else {
            this.mRuleTriggerMap.put(iRuleTrigger.getIdentifier(), iRuleTrigger);
        }
    }

    public void removeRuleTrigger(IRuleTrigger iRuleTrigger) {
        Object[] objArr = {iRuleTrigger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d2e5c5b65fce425f182ced892b9f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d2e5c5b65fce425f182ced892b9f98");
        } else if (iRuleTrigger == null || !this.mRuleTriggerMap.containsKey(iRuleTrigger.getIdentifier())) {
        } else {
            this.mRuleTriggerMap.remove(iRuleTrigger.getIdentifier());
        }
    }

    public IRuleTrigger getRuleTrigger(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfffc3678bb1561747542f589e391935", RobustBitConfig.DEFAULT_VALUE)) {
            return (IRuleTrigger) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfffc3678bb1561747542f589e391935");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mRuleTriggerMap.get(str);
    }

    public void startRuleTrigger(IRuleTrigger iRuleTrigger) {
        Object[] objArr = {iRuleTrigger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c64ea1f890fc7fc5847a1660919103c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c64ea1f890fc7fc5847a1660919103c2");
        } else if (iRuleTrigger != null) {
            iRuleTrigger.start();
        }
    }

    public void stopRuleTrigger(IRuleTrigger iRuleTrigger) {
        Object[] objArr = {iRuleTrigger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8de44c1a77a246ef1f1d006e968be6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8de44c1a77a246ef1f1d006e968be6c0");
        } else if (iRuleTrigger != null) {
            iRuleTrigger.stop();
        }
    }

    public void clearCepRuleTrigger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eda286ca522eaec9c3889c844e37812d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eda286ca522eaec9c3889c844e37812d");
        } else if (this.mRuleTriggerMap != null) {
            Iterator<Map.Entry<String, IRuleTrigger>> it = this.mRuleTriggerMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() instanceof CepRuleTrigger) {
                    it.remove();
                }
            }
        }
    }

    public void resetCep(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a42fc1fb9f63f487ec8115c340d5eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a42fc1fb9f63f487ec8115c340d5eef");
        } else if (!TextUtils.isEmpty(str)) {
            IRuleTrigger iRuleTrigger = this.mRuleTriggerMap.get(str);
            if (iRuleTrigger instanceof CepRuleTrigger) {
                for (Pair<a, org.apache.flink.cep.mlink.stateparser.a> pair : ((CepRuleTrigger) iRuleTrigger).mCepOperatorList) {
                    if (TextUtils.equals(((org.apache.flink.cep.mlink.stateparser.a) pair.second).e, str2)) {
                        ((a) pair.first).a();
                    }
                }
            }
        }
    }
}
