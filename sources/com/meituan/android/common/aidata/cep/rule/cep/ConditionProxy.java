package com.meituan.android.common.aidata.cep.rule.cep;

import com.meituan.android.common.aidata.data.EventBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.flink.cep.pattern.conditions.b;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConditionProxy extends b<EventBean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Class mConditionClass;

    public ConditionProxy(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd632001a5fe02d4fb19b20c5a285e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd632001a5fe02d4fb19b20c5a285e3");
        } else {
            this.mConditionClass = cls;
        }
    }

    @Override // org.apache.flink.cep.pattern.conditions.b
    public boolean filter(EventBean eventBean, b.a<EventBean> aVar) throws InvocationTargetException {
        Object[] objArr = {eventBean, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9768426932b4285a267777e7a9d4d502", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9768426932b4285a267777e7a9d4d502")).booleanValue();
        }
        try {
            Object newInstance = this.mConditionClass.newInstance();
            Method method = this.mConditionClass.getMethod("filter", EventBean.class, b.a.class);
            if (method != null) {
                return ((Boolean) method.invoke(newInstance, eventBean, aVar)).booleanValue();
            }
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String print(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76dd5c60154a5374b75ccf9f729c6ddc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76dd5c60154a5374b75ccf9f729c6ddc");
        }
        try {
            return (String) this.mConditionClass.getMethod("print", String.class).invoke(this.mConditionClass.newInstance(), str);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return "false";
        }
    }
}
