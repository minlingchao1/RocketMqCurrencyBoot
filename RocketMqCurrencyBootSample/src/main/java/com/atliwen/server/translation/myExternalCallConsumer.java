/**
 * 
 */
package com.atliwen.server.translation;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.currencyboot.service.rocketmq.messagelistener.Interface.ExternalCallConsumerInterface;

/**
* <p>Title: myExternalCallConsumer </p>
* <p>@Description: 示例 外调模式 消息加工处理类  </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年5月31日 下午3:41:47 
*/
public class myExternalCallConsumer implements ExternalCallConsumerInterface
{

	@Override
	public String MessageConsumer(String strBody, MessageExt msg,
			ConsumeConcurrentlyContext context)
	{

		return "我了个去";
	}

}
