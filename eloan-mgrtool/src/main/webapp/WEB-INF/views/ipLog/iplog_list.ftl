<#if pageResult.listData?size &gt; 0 >
		<#list pageResult.listData as data>
			<tr>
				<td>${data.username}</a></td>
				<td>${data.loginTime?string("yyyy-MM-dd HH:mm:SS")}</td>
		        <td>${data.ip}</td>
		        <td>${data.displayState}</td>
			</tr>
		</#list>
	<script type="text/javascript">
		$(function(){
			$("#pagination_container").empty().append($('<ul id="pagination" class="pagination"></ul>'));
			$("#pagination").twbsPagination({
				totalPages:${pageResult.totalPage},
				startPage:${pageResult.currentPage},
				onPageClick : function(event, page) {
					$("#currentPage").val(page);
					$("#searchForm").submit();
				}
			});
		});
	</script>
<#else>
	<tr>
		<td colspan="7" align="center">
			<p class="text-danger">没有数据</p>
		</td>
	</tr>
	<script type="text/javascript">
		$(function(){
			$("#pagination_container").empty();
		});
	</script>
</#if>		