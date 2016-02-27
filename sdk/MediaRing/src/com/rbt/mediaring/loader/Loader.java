package com.rbt.mediaring.loader;

import java.io.File;

import android.annotation.SuppressLint;
import android.content.Context;
import dalvik.system.DexClassLoader;

public class Loader{
	
	private DexClassLoader loader;
	
	public static Loader buildLoader(Context context, ClassLoader parent, String plugin){
		Loader loader = new Loader();
		File dir = context.getCacheDir();
		loader.loader = new DexClassLoader(dir.getAbsolutePath(), "", "", parent);
		return loader;
	}
	
	@SuppressLint("NewApi")
	public Class<?> findClass(String name) throws ClassNotFoundException{
		return loader.loadClass(name);
	}
	
	public static Object newInstance(Class<?> cls){
		try {
			return cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
