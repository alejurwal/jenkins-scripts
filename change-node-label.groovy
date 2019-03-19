/*
Author: Alejandro Jurado Walls
Since: March 2019
Description: This script changes/updates the label of a node. To use the script you have to substitute "oldLabel" and "newLabel".
*/

Jenkins.instance.nodes.each { node ->
  	if(node.getAssignedLabels().toString().contains('oldLabel')) {
      	println("node modified: " + node.getDisplayName())
   		node.setLabelString('newLabel')
	}
}
