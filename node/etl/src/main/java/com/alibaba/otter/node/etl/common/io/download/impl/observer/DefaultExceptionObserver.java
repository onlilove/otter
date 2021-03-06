/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.alibaba.otter.node.etl.common.io.download.impl.observer;

import org.slf4j.Logger;

import com.alibaba.otter.node.etl.common.io.download.impl.AbstractCommandDownload;

/**
 * @author brave.taoy
 */
public class DefaultExceptionObserver extends ExceptionObserver {

    private Logger logger;

    public DefaultExceptionObserver(Logger logger){
        this.logger = logger;
    }

    @Override
    public void exceptionOccured(AbstractCommandDownload download, Exception status) {
        this.logger.error(status.getMessage(), status);
    }
}
