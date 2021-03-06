/*
 * Copyright 2007 Daniel Spiewak
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *	    http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.java.ao.cache;

import net.java.ao.RawEntity;


/**
 * @author Daniel Spiewak
 */
public class RAMCache implements Cache {
	private final RAMRelationsCache relationsCache;
	
	public RAMCache() {
		relationsCache = new RAMRelationsCache();
	}

	public CacheLayer createCacheLayer(RawEntity<?> entity) {
		return new RAMCacheLayer();
	}
	
	public void dispose() {
	}

	public RelationsCache getRelationsCache() {
		return relationsCache;
	}
}
