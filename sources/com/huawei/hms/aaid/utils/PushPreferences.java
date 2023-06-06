package com.huawei.hms.aaid.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PushPreferences {
    public static final String TAG = "PushPreferences";
    public SharedPreferences a;

    public PushPreferences(Context context, String str) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
                if (!sharedPreferences.getBoolean(str, false)) {
                    if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putBoolean(str, true);
                        edit.apply();
                    }
                }
                context = createDeviceProtectedStorageContext;
            }
            this.a = b(context, str);
            if (this.a == null) {
                HMSLog.w(TAG, "get new sharedPreferences failed,start to get from context. ");
                this.a = context.getSharedPreferences(str, 0);
                return;
            }
            return;
        }
        throw new NullPointerException("context is null!");
    }

    public final File a(Context context, String str) {
        File file;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getDataDir());
                sb.append("/shared_prefs");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".xml");
                file = new File(sb2, sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(context.getFilesDir().getParent());
                sb4.append("/shared_prefs");
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(".xml");
                file = new File(sb5, sb6.toString());
            }
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e) {
            HMSLog.e(TAG, "get failed error." + e.getMessage());
            return null;
        }
    }

    public final SharedPreferences b(Context context, String str) {
        File a = a(context, str);
        if (a == null) {
            return null;
        }
        try {
            Constructor<?> declaredConstructor = Class.forName("android.app.SharedPreferencesImpl").getDeclaredConstructor(File.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return (SharedPreferences) declaredConstructor.newInstance(a, 0);
        } catch (Exception e) {
            HMSLog.e(TAG, "get SharedPreferences error." + e.getMessage());
            return null;
        }
    }

    public boolean clear() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().clear().commit();
        }
        return false;
    }

    public boolean containsKey(String str) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getAll();
        }
        return new HashMap();
    }

    public boolean getBoolean(String str) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    public int getInt(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public long getLong(String str) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public String getString(String str) {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    public ContentValues read() {
        Map<String, ?> all;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                contentValues.put(key, String.valueOf(value));
            } else if (!(value instanceof Integer) && !(value instanceof Short) && !(value instanceof Byte)) {
                if (value instanceof Long) {
                    contentValues.put(key, (Long) value);
                } else if (value instanceof Float) {
                    contentValues.put(key, (Float) value);
                } else if (value instanceof Double) {
                    contentValues.put(key, Float.valueOf((float) ((Double) value).doubleValue()));
                } else if (value instanceof Boolean) {
                    contentValues.put(key, (Boolean) value);
                }
            } else {
                contentValues.put(key, (Integer) value);
            }
        }
        return contentValues;
    }

    public boolean removeKey(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (edit = this.a.edit()) == null) {
            return false;
        }
        return edit.remove(str).commit();
    }

    public boolean save(String str, Object obj) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof String) {
            edit.putString(str, String.valueOf(obj));
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            edit.putInt(str, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            edit.putInt(str, ((Byte) obj).byteValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            edit.putFloat(str, (float) ((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        }
        return edit.commit();
    }

    public void saveBoolean(String str, boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putBoolean(str, z).commit();
    }

    public void saveInt(String str, Integer num) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putInt(str, num.intValue()).commit();
    }

    public void saveLong(String str, Long l) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong(str, l.longValue()).commit();
    }

    public void saveMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            save(entry.getKey(), entry.getValue());
        }
    }

    public boolean saveString(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.putString(str, str2).commit();
    }

    public boolean write(ContentValues contentValues) {
        if (this.a == null || contentValues == null) {
            return false;
        }
        boolean z = true;
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            if (!save(entry.getKey(), entry.getValue())) {
                z = false;
            }
        }
        return z;
    }

    public boolean removeKey(String[] strArr) {
        if (this.a == null) {
            return false;
        }
        for (String str : strArr) {
            if (this.a.contains(str)) {
                this.a.edit().remove(str);
            }
        }
        this.a.edit().commit();
        return true;
    }
}
