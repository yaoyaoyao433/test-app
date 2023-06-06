package com.sankuai.waimai.irmo.render.bean.layers;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.IJSONArrayParser;
import com.sankuai.waimai.irmo.render.bean.IJSONObjectParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GyroEffectParams extends EffectParams implements IJSONObjectParser {
    private static final String DSL_PARAMS_ACTIONS = "actions";
    private static final String DSL_PARAMS_PID = "pid";
    private static final String DSL_PARAMS_UI = "ui";
    private static final String TAG = "GyroEffectParams_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    public EffectActionGroup effectActionGroup;
    public String pid;
    public float ui;

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "834d681717ae96b74b20c5e2854307e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "834d681717ae96b74b20c5e2854307e9")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            this.pid = jSONObject.getString("pid");
            this.ui = (float) jSONObject.getDouble(DSL_PARAMS_UI);
            JSONArray jSONArray = jSONObject.getJSONArray("actions");
            this.effectActionGroup = new EffectActionGroup();
            return this.effectActionGroup.parse(jSONArray);
        } catch (JSONException e) {
            a.a(TAG, "GyroEffectParams parse fail", e);
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class EffectActionGroup implements IJSONArrayParser {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<EffectAction> mActions;

        public EffectActionGroup() {
            Object[] objArr = {GyroEffectParams.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ad41a6436251b3af425bdd5d144b1dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ad41a6436251b3af425bdd5d144b1dc");
            } else {
                this.mActions = new ArrayList();
            }
        }

        @Override // com.sankuai.waimai.irmo.render.bean.IJSONArrayParser
        public boolean parse(@Nullable JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a39c62f483f126a0af71bdc201cd525", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a39c62f483f126a0af71bdc201cd525")).booleanValue();
            }
            if (jSONArray == null) {
                return false;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    EffectAction effectAction = new EffectAction();
                    if (!effectAction.parse(jSONObject)) {
                        return false;
                    }
                    this.mActions.add(effectAction);
                } catch (JSONException e) {
                    a.a(GyroEffectParams.TAG, "EffectActionGroup parse fail", e);
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class EffectAction implements IJSONObjectParser {
        private static final String DIRECTION_POSITIVE = "positive";
        private static final String DIRECTION_REVERSE = "reverse";
        private static final String DSL_ACTION_DIRECTION = "direction";
        private static final String DSL_ACTION_TYPE = "type";
        private static final String DSL_ACTION_X = "x";
        private static final String DSL_ACTION_Y = "y";
        private static final String DSL_ACTION_Z = "z";
        public static ChangeQuickRedirect changeQuickRedirect;
        public String direction = DIRECTION_POSITIVE;
        public String type;
        public int x;
        public int y;
        public int z;

        public EffectAction() {
        }

        @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
        public boolean parse(@Nullable JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30ae5fb6b11d18bb6784d29b5023cd06", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30ae5fb6b11d18bb6784d29b5023cd06")).booleanValue();
            }
            if (jSONObject == null) {
                return false;
            }
            try {
                this.type = jSONObject.getString("type");
                this.direction = jSONObject.getString("direction");
                this.x = jSONObject.getInt("x");
                this.y = jSONObject.getInt("y");
                this.z = jSONObject.optInt(DSL_ACTION_Z);
                return true;
            } catch (JSONException e) {
                a.a(GyroEffectParams.TAG, "EffectAction parse fail", e);
                return false;
            }
        }

        public boolean isPositive() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "854bc8d0918dbb26377007a72e386c05", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "854bc8d0918dbb26377007a72e386c05")).booleanValue() : !DIRECTION_REVERSE.equalsIgnoreCase(this.direction);
        }
    }
}
