package com.meituan.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SeqIdFactory {
    private static final String KEY_JSON_SEQUENCE_ID = "seqId";
    private static final String KEY_UUID_TIME = "uuid_time";
    private static final String SP_NAME = "babel_seqid";
    private static final long TIME_REFRESH_UUID = 86400000;
    private static final String UUID_BABEL = "babel_uuid";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SeqIdFactory instance;
    private q cipStorageCenter;
    private JSONObject seqIdJson;
    private String sessionId;
    private String uuid;

    public SeqIdFactory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ce9fb544a6ac0f1a1622b378c6c9432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ce9fb544a6ac0f1a1622b378c6c9432");
            return;
        }
        this.sessionId = "";
        if (ProcessUtils.isMainProcess(context)) {
            this.cipStorageCenter = q.a(context, SP_NAME, 1);
        } else {
            this.cipStorageCenter = q.a(context, SP_NAME + ProcessUtils.getCurrentProcessName(), 1);
        }
        loadUuid();
        loadSeqFromSp();
        Random random = new Random();
        this.sessionId = this.uuid + System.currentTimeMillis() + random.nextInt(1000);
    }

    public static SeqIdFactory getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef43c4254837ba2d453db9b8230d4934", RobustBitConfig.DEFAULT_VALUE)) {
            return (SeqIdFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef43c4254837ba2d453db9b8230d4934");
        }
        if (instance == null) {
            synchronized (SeqIdFactory.class) {
                if (instance == null) {
                    instance = new SeqIdFactory(context.getApplicationContext());
                }
            }
        }
        return instance;
    }

    public synchronized void setSequenceId(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a3a537f87646bc43ba81a04dd4b79e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a3a537f87646bc43ba81a04dd4b79e2");
            return;
        }
        if (map != null && !TextUtils.isEmpty(str)) {
            long optLong = this.seqIdJson.optLong(str, 0L) + 1;
            try {
                this.seqIdJson.put(str, optLong);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            saveSeqToSp();
            map.put("metrics_seq_id", Long.valueOf(optLong));
            map.put("metrics_session_id", this.sessionId);
            map.put("metrics_session_uuid", this.uuid);
        }
    }

    private void loadSeqFromSp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7e9ed7a3d20f3c689c51b66277e721f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7e9ed7a3d20f3c689c51b66277e721f");
            return;
        }
        String b = this.cipStorageCenter.b(KEY_JSON_SEQUENCE_ID, "");
        if (TextUtils.isEmpty(b)) {
            this.seqIdJson = new JSONObject();
            return;
        }
        try {
            this.seqIdJson = new JSONObject(b);
        } catch (Throwable th) {
            th.printStackTrace();
            this.seqIdJson = new JSONObject();
        }
    }

    private void saveSeqToSp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1b2074ed668c42ec47391678cb29981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1b2074ed668c42ec47391678cb29981");
        } else {
            this.cipStorageCenter.a(KEY_JSON_SEQUENCE_ID, this.seqIdJson.toString());
        }
    }

    private void loadUuid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be495715a97fbee5fb8477b9a64ba9a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be495715a97fbee5fb8477b9a64ba9a5");
            return;
        }
        this.uuid = this.cipStorageCenter.b(UUID_BABEL, "");
        long b = this.cipStorageCenter.b(KEY_UUID_TIME, 0L);
        if (TextUtils.isEmpty(this.uuid) || TimeUtil.currentTimeMillisSNTP() - b > 86400000) {
            this.uuid = UUID.randomUUID().toString();
            this.cipStorageCenter.a(UUID_BABEL, this.uuid);
            this.cipStorageCenter.a(KEY_UUID_TIME, TimeUtil.currentTimeMillisSNTP());
            this.cipStorageCenter.a(KEY_JSON_SEQUENCE_ID, "");
        }
    }

    public String getSessionId() {
        return this.sessionId;
    }
}
